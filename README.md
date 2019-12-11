# StockPricesAnalytics
There is a formatted file of price ticks for a set of bonds identified by their CUSIPs. Assume a CUSIP is just an 8-character alphanumeric string. Each CUSIP may have any number of prices (e.g., 92.457, 111.515) following it in sequence, one per line. The prices can be considered to be ordered by time in ascending order, earliest to latest.  This is a Java program that prints the closing (or latest) price for each CUSIP in the file. No assumption that the entire file can fit in memory!

About CUSIP and CUSIP Validator (extra information):
A CUSIP (Committee on Uniform Securities Identification Procedures) is a nine-character alphanumeric code which act as a sort of DNA for the security, uniquely identifying a North American financial security or issuer along with the type of security for the purposes of facilitating clearing and settlement of trades. The CUSIP was adopted as an American National Standard under Accredited Standards X9.6. 

What each character represents is as follows:
    The first six characters identify the issuer and are assigned alphabetically.
    The seventh and eighth characters—which can be alphabetical or numerical—identify the type of security.
    The ninth and last digit is used as a check digit.

Example implementation of validating CUSIP Numbers:
Validate that the last digit (i.e., check digit) of the CUSIP code (1st column) is correct, against the following CUSIP Numbers:

      037833100       Apple Incorporated
      17275R102       Cisco Systems
      38259P508       Google Incorporated
      594918104       Microsoft Corporation
      68389X106       Oracle Corporation   (incorrect)
      68389X105       Oracle Corporation
