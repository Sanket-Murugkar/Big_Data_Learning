REGISTER /home/itelligence/pig-0.11.1/contrib/piggybank/java/piggybank.jar

DEFINE CombinedLogLoader org.apache.pig.piggybank.storage.apachelog.CombinedLogLoader();

DEFINE DATE_EXTRACT_dd_MMM_yyyy 
org.apache.pig.piggybank.evaluation.util.apachelogparser.DateExtractor(
'dd/MMM/yyyy:HH:mm:ss Z','dd/MMM/yyyy');

DEFINE DATE_EXTRACT_Z
org.apache.pig.piggybank.evaluation.util.apachelogparser.DateExtractor(
'dd/MMM/yyyy:HH:mm:ss Z','Z');
 
raw_log = LOAD '/home/itelligence/Desktop/Web_Analysis/etlhive1.log' USING CombinedLogLoader AS (addr: chararray, logname: chararray, user: chararray, time: chararray, method: chararray, uri: chararray, proto: chararray, status: int, bytes: int,referer:chararray,browser:chararray);

log = FOREACH raw_log GENERATE $0..$2,DATE_EXTRACT_dd_MMM_yyyy(time) as date ,DATE_EXTRACT_Z(time) as time_zone,$4..;



purchase = LOAD '/home/itelligence/Desktop/Web_Analysis/purchase.txt' using PigStorage(',') as (ip: chararray,name:chararray,date:chararray,product:chararray,amount:chararray);

userAndPurchaseLog = COGROUP log by addr,purchase by ip;


userAndPurchase = FOREACH userAndPurchaseLog GENERATE $0,$1.uri,$2.product;













