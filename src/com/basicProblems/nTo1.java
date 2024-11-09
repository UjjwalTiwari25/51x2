package com.basicProblems;

//public class nTo1 {
//    public static void main(String[] args) {
//        func(5);     //not sout because we are not returning any value
//    }
//    static void func(int n){//void because there is no return type
//        if (n == 0) {
//            return;
//        }
//
//        System.out.println(n);
//        func(n-1);
//        }
//
//}
/*
Bilkul sahi soch rahe ho! Yeh confusion common hai, aur mein explain karta hoon. Yahan pe tumne System.out.println(n); likha hai function ke andar, jo directly screen pe output print kar raha hai. Iska matlab hai ki function n ko print kar raha hai, par koi value "return" nahi kar raha.

Explanation
Return vs. Print: Function func(int n) kuchh bhi return nahi kar raha hai, iska kaam sirf n ko print karna hai aur fir func(n-1) call karna hai. Agar function kuchh return karta (e.g., return n; ya return n + func(n-1);), tab hum int type ka return type use karte. Par kyunki ye sirf print kar raha hai, isliye void return type ka use kiya gaya hai.

System.out.println() Use: Tumne jo System.out.println(n); likha hai, vo ek built-in method hai jo screen pe output print kar raha hai, lekin function ke return value ke sath iska koi relation nahi hai. Agar tum System.out.println ko hata doge, to function ke execution se koi output screen pe nahi dikhai dega, kyunki ab woh sirf recursive calls karke bas values ko internally process karega without printing.

Return Type void: void ka matlab hota hai "no return value." Jab tum static void func(int n) likhte ho, iska matlab hai ki function kuch bhi value return nahi karega, woh bas kaam karega aur fir exit ho jayega. Tumne func(5); call kiya, jo output deta hai, lekin yeh output System.out.println(n); se aa raha hai, return se nahi.

In summary, func(5); function kuch bhi return nahi kar raha hai, bas print kar raha hai. Agar tum print na karte, to screen pe koi output nahi aata, aur tum void return type ke bina System.out.println() ke saath nahi likh pate.

 */
public class nTo1 {
    public static void main(String[] args) {
        funcRev(5);     //not sout because we are not returning any value
    }
    static void funcRev(int n){//void because there is no return type
        if (n == 0) {
            return;
        }

        funcRev(n-1);
        System.out.println(n);

    }

}
