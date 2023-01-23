/*
 * Type[﻿] array = new Type﻿[﻿3﻿]﻿;
array[﻿0﻿] = element1;
array[﻿1﻿] = element2;
array[﻿2﻿] = element3;
The variable does not store the array directly.
It stores a reference that points to it.
 */
//creating an array with 5 students
public class ArraysLen {
	public static void main(String args[]) {
		String[] names = new String[5];
		names[0] = "Radhika";
		names[1] = "Reddy";
		names[2] = "Aashritha";
		names[3] = "Raja";
		names[4] = "Donthi";
		System.out.println(names[0]+" "+"you will take seat 0");
		System.out.println(names[1]+" "+"you will take seat 1");
		System.out.println(names[2]+" "+"you will take seat 2");
		System.out.println(names[3]+" "+"you will take seat 3");
		System.out.println(names[4]+" "+"you will take seat 4");
		
	}

}
