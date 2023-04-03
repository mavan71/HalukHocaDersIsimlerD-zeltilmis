package Projeler.TeamWork.Projet03_1;

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

        String country[]={"Australia" ,"Bahamas" , "Benin" , "Côte d'Ivoire" , "Eritrea" , "New Zealand" , "Panama"};
        int countryPopulation[]={38928346 , 36910560 ,  19237691 , 	11673021 , 586632 , 104425 , 33931};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ülke giriniz");
       String cName=scan.nextLine();

        populationOfCountry(country,countryPopulation,cName);

    }

    public static int populationOfCountry(String arr [], int sayiArr[], String str) {
        ArrayList<String>ülkeList=new ArrayList<>(Arrays.asList(arr));
            int a= (ülkeList.indexOf(str));
        if (Arrays.toString(arr).contains(str)){
            System.out.println(sayiArr[a]);
        }else {
            System.out.println(a);
        }
        return a;
    }





    }

