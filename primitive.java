class primitive{
    public static void main(String args[]){
        byte var1 = 100;
        short var2 = 3000;
        int var3 = 50000;
        long var4 = 50_000L+10L*(long)(var1+var2+var3);
        System.out.println("The Total of the variables are: "+ var4);
        float kun = (float)3.453;
        System.out.println(kun);

        double po = 3.45d;
        double kilo = po * 0.45359237d;
        System.out.println("The converted kilograms is: "+ kilo);

        int result = 10;
        result -= 2;
        System.out.println("The result is: "+ result);
}
}