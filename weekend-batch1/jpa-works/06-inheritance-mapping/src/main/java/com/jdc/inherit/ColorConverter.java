package com.jdc.inherit;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.AttributeConverter;

public class ColorConverter implements AttributeConverter<Color, String> {

	@Override
	public String convertToDatabaseColumn(Color attr) {
		if(null != attr)
			return "%s,%s,%s,%s"
					.formatted(attr.getRed(), attr.getGreen(), 
							attr.getBlue(), attr.getAlpha());
		return null;
	}

	@Override
	public Color convertToEntityAttribute(String str) {
		if(null != str) {
			
			var color = str.split(",");
			
			return new Color(getValue(color[0]), getValue(color[1]), 
					getValue(color[2]), getValue(color[3]));
			
		}
			
		return null;
	}
	
	private float getValue(String str) {
		var factor = new BigDecimal(255);
		var data = new BigDecimal(str);
		return data.divide(factor, 8, RoundingMode.HALF_UP).floatValue();
	}

}
