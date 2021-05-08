/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anbcorp.chapter1.primitivetypes;

/**
 *
 * Java language provides 8 primitive types categorized as below:
 * 
 * 1. Whole Numbers [Size in bits] :
 *      1.1. byte  [8]  : Range | [-128 - 127]
 *      1.2. short [16] : Range | [-32,768 - 32,767]
 *      1.3. int   [32] : Range | [-2,147,483,648 - 2,147,483,647 ] | Default integer literal type
 *      1.4. long  [64] : Range | [-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807]
 *      
 *      Types of representations:
 *          1. Binary: leading with '0b'
 *          2. Octal: '0' leading with
 *          3. Decimal: natural representation '1234'
 *          5. Hexadecimal: leading with '0x' 
 * 
 * 2. Floating Point :
 *      2.1. float [32]
 *      2.2. double [64] | Default Floating point literal type
 * 
 * 3. Character :
 *      3.1. char [16]
 * 
 * 4. Boolean :
 *      4.1. boolean [Undefined] : default value false
 * 
 * 
 * @author Anuj Narayan Bhatt
 */
public class PrimitiveTypes {
    static boolean e;
    public static void main(String[] args) {
        
        //---------------------------------------------------------------------
        // Whole Numbers
        //---------------------------------------------------------------------
        short f = 100;
        System.out.println(f); // output 100;
        // byte b1 = f; // Invalid // Lossy Conversion
        // byte b1 = 128; // Invalid // Lossy Conversion
        
        long l = f;
        System.out.println(l); // output 100; // widening conversion
        
        int a =10;
        int b=0xA;
        int c = 0b1010;
        int d = 012;
        System.out.println(a); // output: 10 : 10 in decimal
        System.out.println(b); // output: 10 : 10 in Hexadecimal
        System.out.println(c); // output: 10 : 10 in binary
        System.out.println(d); // output: 10 : 10 in octal
        
        
        //---------------------------------------------------------------------
        // Floating Point
        //---------------------------------------------------------------------
        
        //float f1 = 1.99E2; 
        // Will give error as default type of flowting point literal is double 
        // and conversion to float reduces memory and might result in data loss.
        
        float f1 = 1.99E2F; // Appending F is important
        System.out.println(f1);
        float f2 = l; // long can be assigned to float
        System.out.println(f2); // Output 100 ( Value of variaable 'l' )
        
        //---------------------------------------------------------------------
        // Character
        //---------------------------------------------------------------------
        
        char ch='A';
        // char ch1 ='AB'; // Invalid
        // char ch1 ="A"; // Invalid // Characters are in single quotes and strings in double
        char ch_Ascii='\101';
        char ch_Unicode='\u0041';
        System.out.println(ch);            // output 'A'
        System.out.println(ch_Ascii);      // output 'A' : ascii value of 'A'
        System.out.println(ch_Unicode);    // output 'A' : Unicode value of 'A'
        char ch_int = 65;
        System.out.println(ch_int);    // output 'A'
        
        
        //---------------------------------------------------------------------
        // Boolean
        //---------------------------------------------------------------------
        System.out.println(e); // output false : default value
        e=true;
        System.out.println(e); // output true
        // e=True // Invalid // Java is case sensitive hence true and True are different.
    }
}
