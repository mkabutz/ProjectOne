package practice1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LargestNum {
    public static void main(String[] args) {

        double a = -3.4, b = -2.1, c = -2.1, largest;

        if (a >= b) {

            if (a >= c) {
                largest = a;
            }

            else {
                largest = c;
            }
        } else {

            if (b >= c) {
                largest = b;
            }

            else {
                largest = c;
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}

