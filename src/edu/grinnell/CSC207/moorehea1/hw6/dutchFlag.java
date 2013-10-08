package edu.grinnell.CSC207.moorehea1.hw6;

import java.io.PrintWriter;

public class dutchFlag {

    public static void swap(String[] array, int first, int second) {
	String holder = array[first];
	array[first] = array[second];
	array[second] = holder;
    } // swap(String[], int, int)

    public static void main(String[] args) throws Exception {
	PrintWriter pen = new PrintWriter(System.out, true);
	int R = 0;
	int W = 0;
	int B = 0;
	// String[] flag = new String[size];
	String[] flag = {"blue", "red", "red", "white", "red", "white", "blue"/*, "white", "white", "blue", "white"*/};
	int size = flag.length;

	while (R <= W && W <= B && B < size) {
	    switch (flag[B]) {
	    case "red":
		swap(flag, R, B);
		R++;
		if (R > W)
		    W++;
		if (W > B)
		    B++;
		pen.println("test1");
		break;
	    case "white":
		swap(flag, W, B);
		W++;
		if (W > B)
		    B++;
		pen.println("test2");
		break;
	    case "blue":
		B++;
		pen.println("test3");
		break;
	    } // switch
	} // while
	pen.print("{");
	for (int i = 0; i < size; i++) {
	    pen.print("\"" + flag[i] + "\"");
	    if (i != size-1) {
		pen.print(", ");
	    }
	} // for
	pen.println("}");
    } // main
} // dutchFlag
