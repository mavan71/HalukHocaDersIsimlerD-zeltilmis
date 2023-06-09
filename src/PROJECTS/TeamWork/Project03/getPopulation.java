package PROJECTS.TeamWork.Project03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class getPopulation {
/*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    TASK ->

    Method name :  populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) parametre almalı.

     countryNames -> Ülke isimleri

     countryPopulations -> Ülke nüfusları

     method eğer str Ülke isimlerinden bir eleman  içeriyorsa o ülke nüfusunu return etmeli

      example;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico" için  return :  120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */
    public static void main(String[] args) {

        String countryArr[]={"USA" ,"Mexico" ,"Canada","Türkiye","Almanya","Fransa"};
        int populationArr[]={100000,120000,130000,40000,50000,70000};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ülke giriniz");
       String str=scan.nextLine();

        populationOfCountry(countryArr,populationArr,str);

    }

    public static int populationOfCountry(String arr [], int sayiArr[], String str) {
        ArrayList<String>ülkeList=new ArrayList<String>(Arrays.asList(arr));
            int a= (ülkeList.indexOf(str));
        if (Arrays.toString(arr).contains(str)){
            System.out.println(sayiArr[a]);
        }else {
            System.out.println(a);
        }
        return a;
    }





    }

