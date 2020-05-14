package com.java.exceptions;

public class FinallyTest {


    public static void main(String[] args) {
        try{
            throw new Exception();
        }catch (Exception e){
            try{
                throw new Exception();
            } catch(Exception e1){

            }finally{
                System.out.println("inside try");
            }
        }finally{
            System.out.println("outside try");
        }
    }
}
