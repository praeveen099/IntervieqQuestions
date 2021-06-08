import pandas as pd
import datetime


df = pd.ExcelFile(r'C:\Users\Acer\Downloads\KPMG_VI_New_raw_data_update_final.xlsx')
customerDemographic = pd.read_excel(df, 'CustomerDemographic')


x=[]
x.append(customerDemographic['DOB'])


print(x[0][0])

for loopIndex in range(0, 4000):
    dateToPrint = x[0][loopIndex]
    date = dateToPrint.strftime('%Y/%m/%d')
    year, month, day  = date.split('/')
    
    isValidDate = True
    try :
      datetime.datetime(int(year),int(month),int(day))
    except ValueError :
      isValidDate = False
      
    if (not isValidDate):
        print(date)
      

    
    
"""


for dates in x: 
    year, month, day  = dates.split('-')
    print(year)

    isValidDate = True
    try :
      datetime.datetime(int(year),int(month),int(day))
    except ValueError :
      isValidDate = False
      
      if (not isValidDate):
          print(dates)
"""
    
    
