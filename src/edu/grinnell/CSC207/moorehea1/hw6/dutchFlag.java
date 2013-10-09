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
	String[] flag = { "blue", "white", "red", "white", "red", "blue",
		"red", "white", "blue", "white", "white", "blue", "white",
		"red", "white", "red" };
	int size = flag.length;

	/**
	 * Implementation 1
	 */
	while (R <= W && W <= B && B < size) {
	    switch (flag[B]) {
	    case "red":
		swap(flag, R, B);
		R++;
		if (R > W)
		    W++;
		if (W > B)
		    B++;
		break;
	    case "white":
		swap(flag, W, B);
		W++;
		if (W > B)
		    B++;
		break;
	    case "blue":
		B++;
		break;
	    } // switch
	} // while
	
	pen.print("First Implementation: {");
	for (int i = 0; i < size; i++) {
	    pen.print("\"" + flag[i] + "\"");
	    if (i != size - 1) {
		pen.print(", ");
	    } // if
	} // for
	pen.println("}");

	
	/**
	 * Implementation 2
	 */
	R = size - 1;
	W = size - 1;
	B = size - 1;
	while (R <= W && W <= B && R > -1) {
	    switch (flag[R]) {
	    case "blue":
		swap(flag, B, R);
		B--;
		if (B < W)
		    W--;
		if (W < R)
		    R--;
		break;
	    case "white":
		swap(flag, W, R);
		W--;
		if (W < R)
		    R--;
		break;
	    case "red":
		R--;
		break;
	    }// switch
	}// while

	pen.print("Second Implementation: {");
	for (int i = 0; i < size; i++) {
	    pen.print("\"" + flag[i] + "\"");
	    if (i != size - 1) {
		pen.print(", ");
	    }// if
	}// for
	pen.println("}");

    } // main
} // dutchFlag
