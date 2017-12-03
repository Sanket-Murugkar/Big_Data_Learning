REGISTER /home/itelligence/pig-0.11.1/contrib/piggybank/java/piggybank.jar

DEFINE CombinedLogLoader org.apache.pig.piggybank.storage.apachelog.CombinedLogLoader();

DEFINE DATE_EXTRACT_dd_MMM_yyyy 
org.apache.pig.piggybank.evaluation.util.apachelogparser.DateExtractor(
'dd/MMM/yyyy:HH:mm:ss Z','dd/MMM/yyyy');

DEFINE DATE_EXTRACT_Z
org.apache.pig.piggybank.evaluation.util.apachelogparser.DateExtractor(
'dd/MMM/yyyy:HH:mm:ss Z','Z');
 
raw_log = LOAD '/home/itelligence/Desktop/Web Analysis/etlhive.log' USING CombinedLogLoader AS (addr: chararray, logname: chararray, user: chararray, time: chararray, method: chararray, uri: chararray, proto: chararray, status: int, bytes: int,referer:chararray,browser:chararray);

log = FOREACH logs GENERATE $0..$2,DATE_EXTRACT_dd_MMM_yyyy(time) as date ,DATE_EXTRACT_Z(time) as time_zone,$4..;




### No of paid vs non paid click per day########


paid_clicks = FILTER log BY uri matches '.*gclid.*';

non_paid_clicks = FILTER log BY NOT(uri matches '.*gclid.*');


per_day_click = COGROUP paid_clicks by date, non_paid_clicks by date;

per_day_click_count = FOREACH per_day_click GENERATE $0, COUNT($1), COUNT($2);

dump per_day_click_count;
########################################################

