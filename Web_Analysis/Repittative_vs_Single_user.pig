REGISTER /home/itelligence/pig-0.11.1/contrib/piggybank/java/piggybank.jar

DEFINE CombinedLogLoader org.apache.pig.piggybank.storage.apachelog.CombinedLogLoader();

DEFINE DATE_EXTRACT_dd_MMM_yyyy 
org.apache.pig.piggybank.evaluation.util.apachelogparser.DateExtractor(
'dd/MMM/yyyy:HH:mm:ss Z','dd/MMM/yyyy');

DEFINE DATE_EXTRACT_Z
org.apache.pig.piggybank.evaluation.util.apachelogparser.DateExtractor(
'dd/MMM/yyyy:HH:mm:ss Z','Z');
 
raw_log = LOAD '/home/itelligence/Desktop/Web_Analysis/etlhive.log' USING CombinedLogLoader AS (addr: chararray, logname: chararray, user: chararray, time: chararray, method: chararray, uri: chararray, proto: chararray, status: int, bytes: int,referer:chararray,browser:chararray);

log = FOREACH raw_log GENERATE $0..$2,DATE_EXTRACT_dd_MMM_yyyy(time) as date ,DATE_EXTRACT_Z(time) as time_zone,$4..;



group_by_user = group log by addr;

frequency_of_user = FOREACH group_by_user GENERATE $0,COUNT($1);



repetative_customer = FILTER frequency_of_user by $1>1;

one_time_customer=FILTER frequency_of_user by $1==1;



repetative_customer_count= FOREACH(GROUP repetative_customer ALL) GENERATE COUNT(repetative_customer);

one_time_customer_count= FOREACH(GROUP one_time_customer ALL) GENERATE COUNT(one_time_customer);

raito= JOIN repetative_customer_count by $0 FULL OUTER,one_time_customer_count by $0;

raito1 =UNION repetative_customer_count,one_time_customer_count;

dump raito1;










