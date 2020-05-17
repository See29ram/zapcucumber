package com.udemy.datadriven;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import io.cucumber.core.backend.ParameterInfo;
import io.cucumber.cucumberexpressions.Transformer;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTable.TableConverter;

public class ExcelDataToDataTable implements Transformer<DataTable> {

	@Override
	public DataTable transform(String filePath) throws Throwable {
		// TODO Auto-generated method stub
		
		ExcelReader reader=new ExcelReader.ExcelReaderBuilder().setFileLocation(filePath).setSheet(0).build();
		List<List<String>> excelData= reader.getSheetDataAt();
		
		
		
		//ParameterInfo parameterInfo = new ParameterInfo(null, null, null, null);
	   // TableConverter tableConverter = new TableConverter(new LocalizedXStreams(Thread.currentThread().getContextClassLoader()).get(Locale.getDefault()), parameterInfo);
		
		//DataTable dt=new DataTable(excelData)
		
		return DataTable.create(excelData);
	}

	
	
	
	
	
}
