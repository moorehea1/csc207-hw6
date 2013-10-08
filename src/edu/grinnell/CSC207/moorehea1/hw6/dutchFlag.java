package edu.grinnell.CSC207.moorehea1.hw6;

import java.io.PrintWriter;

public class dutchFlag {

    public static void swap(String[] array, int first, int second) {
	String holder;

	holder = array[first];
	array[first] = array[second];
	array[second] = holder;

    } // swap

    public static void main(String[] args) throws Exception {
	PrintWriter pen = new PrintWriter(System.out, true);

	int R = 0;
	int W = 1;
	int B = 2;
	int index = 3;
	// String[] flag = new String[size];
	String[] flag = { "blue", "white", "red", "red", "blue", "red", "white" };
	int size = flag.length;

	while (R <= W && W <= B && B < size) {
	    
	    switch (flag[index]) {
	    case "red":
		swap(flag, R, index);
		R++;
		index++;
		//W++;
		//B++;
		pen.println("test1");
		break;
	    case "white":
		swap(flag, W, index);
		W++;
		index++;
		//B++;
		pen.println("test2");
		break;
	    case "blue":
		swap(flag, B, index);
		B++;
		index++;
		pen.println("test3");
		break;
	    } // switch
	} // while

	for (int i = 0; i < size; i++) {
	    pen.println(flag[i]);
	}
    } // main
} // dutchFlag
