package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// create input value conv
		Scanner conv = new Scanner(System.in);
        int menuSelection = 0;
        boolean calculationcontinue = true;
        while(calculationcontinue) {
        	
        	menu();  // display menu 1
        	menuSelection = conv.nextInt();
        	
        	switch(menuSelection) {
        	case 1: {  // Volume
        		displayVolume();
        		double convValue[] = getValue(conv);
        		
        		//System.out.println("Value to convert :"+convValue[1]);
        		convertVolume(convValue);
        		break;
        	}
        	case 2: {  // Volume
        		displayDistance();
        		double convValue[] = getValue(conv);
        		convertDistance(convValue);
        		break;
        	}
        	case 3: {  // Volume
        		displayArea();
        		double convValue[] = getValue(conv);
        		convertArea(convValue);
        		break;
        	}
        	case 4: {  // Volume
        		displayTemperature();
        		double convValue[] = getValue(conv);
        		convertTemperature(convValue);
        		break;
        	}
        	case 5: {  // Volume
        		displaySpeed();
        		double convValue[] = getValue(conv);
        		convertSpeed(convValue);
        		break;
        	}
        	case 6: {
        		System.out.println("Exit calculatio ...");
        		
        		calculationcontinue = false;
        		System.exit(0);
        		break;
        	}
        	default: {
				System.out.println("\033[1;31mWorng option try gain");
        	    break;
        	}
        	} //end switch statement
        	System.out.println("Continue another conversion [y/n]?");
        	String str = conv.next();
        	if (!str.equalsIgnoreCase("Y")) {
        		System.out.println("Exit calculatio ...");
         		calculationcontinue = false;
        		System.exit(0);
        	}
        } // end while statement
        
        //conv.close();
	}
	//  Main Menu display
	public static void menu() {
    	System.out.println("\033[1;31mMENU-1 Select Measurement Unit:\r\n"
    			+ "\033[1;37m		1. Volume\r\n"
    			+ "	2. Distance\r\n"
    			+ "	3. Area\r\n"
    			+ "	4. Temperature\r\n"
    			+ "	5. Speed\r\n"
    			+ "	6. Quit\r\n"
    			+	"\033[1;34mPlease Select : ");
	}
    // volume Menu display
	public static void displayVolume() {
    	System.out.println("\033[1;31mVolume Menu Conversion of Measurement Units:\r\n"
    			+ "\033[1;37m		1. teaspoon to tablespoon\r\n"  // divide 3
    			+ "	2. teaspoon to cup\r\n"    // divide 48.692
    			+ "	3. Liter to USGallon\r\n"   // divide 3.785
    			+ "	4. Liter to Ounce\r\n"     // divide 33.814
    			+ "	5. USGallon to Imperial Gallon\r\n"   // divide 1.201
    			+ "	6. Quit\r\n"
    			+	"\033[1;35mPlease Select unit to convert: ");
	}
	// Distance Menu display
	public static void displayDistance() {
    	System.out.println("\033[1;31mDistance Menu Conversion of Measurement Units:\r\n"
    			+ "\033[1;37m		1. Foot to Meters\r\n"  // divide 3.281
       			+ "	2. Mile to Kilometrer\r\n"    // divide 1.609
    			+ "	3. meter to Yard\r\n"   // divide 3.785
    			+ "	4. Yard to Foot\r\n"     // multiply by 3
    			+ "	5. Mile to Yard\r\n"   // divide 1.201
    			+ "	6. Quit\r\n"
    			+	"\033[1;34mPlease Select : ");
	}
	// Area Menu display
	public static void displayArea() {
    	System.out.println("\033[1;31mArea Menu Conversion of Measurement Units:\r\n"
    			+ "\033[1;37m		1. Square Foot to Square Meters\r\n"  // divide 10.764
    			+ "	2. Square Mile to Square Kilometrer\r\n"    // Square 2.59
    			+ "	3. Square meter to Square Yard\r\n"   // multiple by 1.1196
    			+ "	4. Square Yard to SquareFoot\r\n"     // multiply by 9
    			+ "	5. Square Mile to SquareYard\r\n"   // divide 1.201
    			+ "	6. Quit\r\n"
    			+	"\033[1;34mPlease Select : ");
	}
	// Temperature Menu display
	public static void displayTemperature() {
    	System.out.println("\033[1;31mTemperature Menu Conversion of Measurement Units:\r\n"
    			+ "\033[1;37m		1. Fahrenheit to Celsius\r\n"  // divide 10.764
    			+ "	2. Fahrenheit to Kelvin\r\n"    // Square 2.59
    			+ "	3. Celsius to Fahrenheit\r\n"   // multiple by 1.1196
    			+ "	4. Celsius to Kelvin\r\n"     // multiply by 9
    			+ "	5. Kelvin to Fahrenheit\r\n"   // divide 1.201
    			+ "	6. Quit\r\n"
    			+	"\033[1;34mPlease Select : ");
	}
	// Temperature Menu display
	public static void displaySpeed() {
    	System.out.println("\033[1;31mSpeed Menu Conversion of Measurement Units:\r\n"
    			+ "\033[1;37m		1. Miles per hour to Kilometer per hour\r\n"  // divide 10.764
    			+ "	2. Knot to Foot per second\r\n"    // Square 2.59
    			+ "	3. Meter per second to Foot per second\r\n"   // multiple by 1.1196
    			+ "	4. Foot per second to Meter per second \r\n"     // multiply by 9
    			+ "	6. Quit\r\n"
    			+	"\033[1;34mPlease Select : ");
	}
	
	public static double[] getValue(Scanner conv2) {
		
		double arrayoutput[] = new double[2];
		//Scanner conv2 = new Scanner(System.in);
		System.out.println("you select option to convert: ");
		int optionconv = conv2.nextInt();
		if (optionconv == 6) {
			    System.out.println("End Calculation ...");
				System.exit(0);	
		}
		System.out.println("Input the value to convert to: ");
		double convdim = conv2.nextDouble();
		arrayoutput[0] = optionconv;
		arrayoutput[1] = convdim;
		//conv2.close();
		return arrayoutput;
		
	}
	
	public static void convertVolume(double[] value) {
		switch((int)value[0]) {
		case 1:
			convertTeaspoontoTablespoon(value);
			break;
		case 2:
			convertTeaspoontoCup(value);
			break;
		case 3:
			convertLitertoUSGallon(value);
		    break;
		case 4:
			convertLitertoOunce(value);
			break;
		case 5:
			convertUSGallontoImpGallon(value);
			break;

			default:
				System.out.println("Worng option try gain");
		} // end switch
		
	}  //end method
	
	public static void convertDistance(double[] value) {
		switch((int)value[0]) {
		case 1:
			convertFoottoMeter(value);
			break;
		case 2:
			convertMiletoKilometer(value);
			break;
		case 3:
			convertMetertoYard(value);
		    break;
		case 4:
			convertYardtoFoot(value);
			break;
		case 5:
			convertMiletoYard(value);
			break;
	
			default:
				System.out.println("Worng option try gain");
		} // end switch
		
	}  //end method
	public static void convertArea(double[] value) {
		switch((int)value[0]) {
		case 1:
			convertSquareFoottoMeter(value);
			break;
		case 2:
			convertSquareMiletoKilometer(value);
			break;
		case 3:
			convertSquareMetertoYard(value);
		    break;
		case 4:
			convertSquareYardtoFoot(value);
			break;
		case 5:
			convertSquareMiletoYard(value);
			break;
	
			default:
				System.out.println("Worng option try gain");
		} // end switch
		
	}  //end method
	public static void convertTemperature(double[] value) {
		switch((int)value[0]) {
		case 1:
			convertFahrenheittoCelsius(value);
			break;
		case 2:
			convertFahrenheittoKelvin(value);
			break;
		case 3:
			convertCelsiustoFahrenheit(value);
		    break;
		case 4:
			convertCelsiustoKelvin(value);
			break;
		case 5:
			convertKelvintoFahrenheit(value);
			break;

			default:
				System.out.println("Worng option try gain");
		} // end switch
		
	}  //end method
	public static void convertSpeed(double[] value) {
		switch((int)value[0]) {
		case 1:
			convertMilesperhourtoKilometerperhour(value);
			break;
		case 2:
			convertKnottoFootpersecond(value);
			break;
		case 3:
			convertMeterpersecondtoFootpersecond(value);
		    break;
		case 4:
			convertFootpersecondtoMeterpersecond(value);
			break;

			default:
				System.out.println("Worng option try gain");
		} // end switch
	}  //end method
    // volume calculation
		public static void convertTeaspoontoTablespoon(double[] value) {
			double result = value[1]/3;
			System.out.println("Result :"+ result);
		}
		public static void convertTeaspoontoCup(double[] value) {
			double result = value[1]/48.692;
			System.out.println("Result :"+ result);
		}
		public static void convertLitertoUSGallon(double[] value) {
			double result = value[1]/3.78;
			System.out.println("Result :"+ result);
		}
		public static void convertLitertoOunce(double[] value) {
			double result = value[1]/33.814;
			System.out.println("Result :"+ result);
		}
		public static void convertUSGallontoImpGallon(double[] value) {
			double result = value[1]/1.201;
			System.out.println("Result :"+ result);
		}
	// Distance calculation
		public static void convertFoottoMeter(double[] value) {
			double result = value[1]/3.281;
			System.out.println("Result :"+ result);
		}
		public static void convertMiletoKilometer(double[] value) {
			double result = value[1]*1.609;
			System.out.println("Result :"+ result);
		}
		public static void convertMetertoYard(double[] value) {
			double result = value[1]*1.094;
			System.out.println("Result :"+ result);
		}
    	public static void convertYardtoFoot(double[] value) {
			double result = value[1]*3;
			System.out.println("Result :"+ result);
		}
		public static void convertMiletoYard(double[] value) {
			double result = value[1]*1760;
			System.out.println("Result :"+ result);
		}
	    
   // Area conversion calculation
		public static void convertSquareFoottoMeter(double[] value) {
			double result = value[1]/(3.281*3.281);
			System.out.println("Result :"+ result);
		}
		public static void convertSquareMiletoKilometer(double[] value) {
			double result = value[1]/(1.609*1.609);
			System.out.println("Result :"+ result);
		}
		public static void convertSquareMetertoYard(double[] value) {
			double result = value[1]*(1.094*1.094);
			System.out.println("Result :"+ result);
		}
    	public static void convertSquareYardtoFoot(double[] value) {
			double result = value[1]*(3*3);
			System.out.println("Result :"+ result);
		}
		public static void convertSquareMiletoYard(double[] value) {
			double result = value[1]*(1760*1760);
			System.out.println("Result :"+ result);
		}
	//  Temperature conversion calculation
		
		public static void convertFahrenheittoCelsius(double[] value) {
			double result = (value[1]-32)*5/9;
			System.out.println("Result :"+ result);
		}
		public static void convertFahrenheittoKelvin(double[] value) {
			double result = (value[1]-32)*5/9+273.15;
			System.out.println("Result :"+ result);
		}
		public static void convertCelsiustoFahrenheit(double[] value) {
			double result = (value[1]*9/5)+32;
			System.out.println("Result :"+ result);
		}
    	public static void convertCelsiustoKelvin(double[] value) {
			double result = value[1]+273.15;
			System.out.println("Result :"+ result);
		}
		public static void convertKelvintoFahrenheit(double[] value) {
			double result = ((value[1]-273.15)*9/5)+32;
			System.out.println("Result :"+ result);
		}
	// Speed conversion calculation
		public static void convertMilesperhourtoKilometerperhour(double[] value) {
			double result = value[1]*1.609;
			System.out.println("Result :"+ result);
		}
		public static void convertKnottoFootpersecond(double[] value) {
			double result = value[1]*1.688;
			System.out.println("Result :"+ result);
		}
		public static void convertMeterpersecondtoFootpersecond(double[] value) {
			double result = value[1]*3.281;
			System.out.println("Result :"+ result);
		}
    	public static void convertFootpersecondtoMeterpersecond(double[] value) {
			double result = value[1]/3.281;
			System.out.println("Result :"+ result);
			}
		
}
