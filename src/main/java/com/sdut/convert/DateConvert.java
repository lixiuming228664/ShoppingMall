package com.sdut.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * S source 源 T target 目标
 * 
 * @author wgy
 *
 */
public class DateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String source) {

		DateFormat[] dfs = {
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), 
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"),
				new SimpleDateFormat("yyyy/MM/dd"),
				new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒"), 
				new SimpleDateFormat("yyyy年MM月dd日"), };

		for (int i = 0; i < dfs.length; i++) {
			try {
				return dfs[i].parse(source);
			} catch (ParseException e) {
				continue;
			}
		}

		return null;
	}

}
