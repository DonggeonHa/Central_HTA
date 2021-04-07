package day3.abstraction;	

public class ReporterApp {

	public static void main(String[] args) {
		
		BasicChart chart1 = new BasicChart();
		chart1.setTitle("1/4분기 매출현황");
		// chart1.setData(data);
		
		LineChart chart2 = new LineChart();
		chart2.setTitle("2/4분기 매출현황");
		
		Reporter reporter = new Reporter();
		
		// 객체의 조립
		reporter.setChart(chart2);
		
		// 보고서 생성
		reporter.createReport();
	}
}
