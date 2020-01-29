package com.chhitijbhattachan.tutorials.java.api.java_lang;
public class DemoStringBuilder{
    public static void main(String... args){
        StringBuilder strBuilder = new StringBuilder();
        System.out.printf("the current length is : %d, the current capacity is : %d%n",strBuilder.length(), strBuilder.capacity());
        strBuilder.append("");
        System.out.printf("the current length is : %d, the current capacity is : %d%n",strBuilder.length(), strBuilder.capacity());
        strBuilder.append("hello "); // append string literal
        System.out.printf("the current length is : %d, the current capacity is : %d%n",strBuilder.length(), strBuilder.capacity());
        strBuilder.append(new Object());// append object
        System.out.printf("the current length is : %d, the current capacity is : %d%n",strBuilder.length(), strBuilder.capacity());
        strBuilder.append(" chhitij bhattachan");
        System.out.printf("the current length is : %d, the current capacity is : %d%n",strBuilder.length(), strBuilder.capacity());
        System.out.println("the current value of string builder is : " + strBuilder.toString());
        System.out.printf("the value of string builder in reverse is : %s%n", strBuilder.reverse().toString());
        //strBuilder.append(str, offset, len);
        //strBuilder.codePointAt(index); // returns unicode point of type integer
        //strBuilder.deleteCharAt(index); // deletes the character at index
        System.out.println(strBuilder.indexOf("jit")); // returns the index of the string value
        // strBuilder.delete(start, end)
        strBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
        /**
         * insert characters, numbers, string to the string
         */
        strBuilder.insert(dstOffset, s);
        /**
         * remove characters, string from the string
         */
        /**
         * replace characters from the string
         */
        /**
         * add primitive data type, string to the string
         */
    }
}