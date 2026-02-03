package com.functionalinterfaces.dateexportfeature;

public interface ReportingModule {
	public default void exportToJson() {
		System.out.println("Exporting module to JSON!");
	}
}
