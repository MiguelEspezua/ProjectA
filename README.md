# Project A: Unit Converter Application 
https://github.com/MiguelEspezua/ProjectA

## Instructions

1.  In Eclipse, create a new Java Project named "UnitConverter"
2.  In the UnitConverter project, create a package named "`main`"
3.  Inside the  `main` package, create a class named  `Converter`, which has a  `main(String[])`  method.

Inside this  `main(String[])` method, your code should follow this pattern:

1.  Create an  `int` variable named  `menuSelection`
2.  Inside a  `while` loop, with the condition  `menuSelection != /*last menu option */`
    1.  Using System.out.println(), print a menu with numbered options. For  _**example**_ (please feel free to choose your own conversions):
        1.  Please select an option:
            1. Cups to Teaspoons
            2. Miles to Kilometers
            3. US Gallons to Imperial Gallons
            4. Quit
            
    2.  Use a Scanner object to collect the user's  `menuSelection`
    3.  `switch`  on the selection to collect the user's quanity of the first unit, convert to the second unit, and print the output.


## Edition
The java code where writed using worspace spring tool suite 4
![enter image description here](https://www.zoltanraffai.com/blog/wp-content/uploads/2019/05/sts4-big.gif)


## code structure
public class Converter {
        public static void main(String[] args) {
        public static void menu() {
        public static void displayVolume() {
        public static void displayDistance() {
        public static void displayArea() {
        public static void displayTemperature() {
        public static void displaySpeed() {
        public static double[] getValue(Scanner conv2) {
        public static void convertVolume(double[] value) {
        public static void convertDistance(double[] value) {
        public static void convertArea(double[] value) {
        public static void convertTemperature(double[] value) {
        public static void convertSpeed(double[] value) {
                public static void convertTeaspoontoTablespoon(double[] value) {
                public static void convertTeaspoontoCup(double[] value) {
                public static void convertLitertoUSGallon(double[] value) {
                public static void convertLitertoOunce(double[] value) {
                public static void convertUSGallontoImpGallon(double[] value) {
                public static void convertFoottoMeter(double[] value) {
                public static void convertMiletoKilometer(double[] value) {
                public static void convertMetertoYard(double[] value) {
                public static void convertYardtoFoot(double[] value) {
                public static void convertMiletoYard(double[] value) {
                public static void convertSquareFoottoMeter(double[] value) {
                public static void convertSquareMiletoKilometer(double[] value) {
                public static void convertSquareMetertoYard(double[] value) {
                public static void convertSquareYardtoFoot(double[] value) {
                public static void convertSquareMiletoYard(double[] value) {
                public static void convertFahrenheittoCelsius(double[] value) {
                public static void convertFahrenheittoKelvin(double[] value) {
                public static void convertCelsiustoFahrenheit(double[] value) {
                public static void convertCelsiustoKelvin(double[] value) {
                public static void convertKelvintoFahrenheit(double[] value) {
                public static void convertMilesperhourtoKilometerperhour(double[] value) {
                public static void convertKnottoFootpersecond(double[] value) {
                public static void convertMeterpersecondtoFootpersecond(double[] value) {
               public static void convertFootpersecondtoMeterpersecond(double[] value) {

## Using java instruction

### Scanner

### while 

### switch

## Result
Example:
[1;31mMENU-1 Select Measurement Unit:
[1;37m		1. Volume
	2. Distance
	3. Area
	4. Temperature
	5. Speed
	6. Quit
[1;34mPlease Select : 
2
[1;31mDistance Menu Conversion of Measurement Units:
[1;37m		1. Foot to Meters
	2. Mile to Kilometrer
	3. meter to Yard
	4. Yard to Foot
	5. Mile to Yard
	6. Quit
[1;34mPlease Select : 
you select option to convert: 
2
Input the value to convert to: 
12
Result :19.308
Continue another conversion [y/n]?
