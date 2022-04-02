package com.sayesha.doubts;


import java.util.*;
public class ComparableEx implements Comparable <ComparableEx>{



int marks;
String name;
public ComparableEx(String name,int marks)
{
this.name=name;
this.marks=marks;
}
public String toString()
{
return "["+this.name+","+this.marks+"]";
}
@Override
public int compareTo(ComparableEx o) {
if(this.marks==o.marks)
return 0;
else
if(this.marks>o.marks)
return 1;
else
return -1;
}

public static void main(String[] args)
{
TreeSet set=new TreeSet();
set.add(new ComparableEx("Peter",34));
set.add(new ComparableEx("Sam",55));
set.add(new ComparableEx("Edgar",44));
set.add(new ComparableEx("William",49));
set.add(new ComparableEx("Harry",52));
System.out.println(set);

}
}