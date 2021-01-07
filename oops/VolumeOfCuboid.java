package oops;

import java.util.*;
import java.lang.*;
import java.io.*;

class Cuboid 
{
    int l,h,w,volume;
    
    public void set_length(int l)  
    {
        this.l = l;
    }
    public void set_width(int w)
    {
        this.w = w;
    }
    public void set_height(int h)
    {
        this.h = h;
    }
    public void volume()
    {
    	this.volume = volume;  
    }
}

class VolumeOfCuboid 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		int l,w,h;
		l = sc.nextInt();
	    w = sc.nextInt();
		h = sc.nextInt();
		
		Cuboid obj = new Cuboid();
		obj.set_length(l);
		obj.set_length(w);
		obj.set_length(h);
		obj.volume = l*w*h;
		System.out.println(obj.volume);
	
		t--;
		}
	}
}
