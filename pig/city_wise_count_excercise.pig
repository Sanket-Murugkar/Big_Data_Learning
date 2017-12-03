ord = LOAD '/home/itelligence/Sidpractice/orders.csv'USING PigStorage(',');

A= FOREACG ord genearte $17,$9;

B= filter a by substaring($0,0,1) == '$';



B= FOREACG ord genearte $18,$9;



A1=forecah ord genearte $18,$0            

B1= filter A1 by substaring($0,0,1) == '$';
