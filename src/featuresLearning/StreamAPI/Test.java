package featuresLearning.StreamAPI;

/*
* java.util.streams meant for processing objects from collection i.e its represent a stream of objects
* from collection but java.io streams meant for processing binary and character data w.r.t file
* i.e it represent stream of binary data or character data from the file. hence java.io streams and java.util.stream
* both are different.
*
* */

/*  => Difference between collection and stream
* if we want to represent a group of individual objects as a single Entry then we should go for collection
* if we want to process a group of object from the collection then we should go for streams.
* we can create a stream object to the collection by using stream() method of collection interface.stream()
* method is a default method added to the collection in 1.8
* ex Stream s= c.stream();
*
*
* Stream is an interface present in java.util.stream. once we got the stream, by using that we can process objects of that collection.
* we can process the object in the following 2 phases.
* 1-> configuration.
* 2-> processing.
* */

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) {

        ArrayList<Integer> i1= new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            i1.add(i);

        }
        System.out.println(i1);
        // this is with out  steam method
        ArrayList<Integer>i2= new ArrayList<>();
        for(Integer i:i1)
        {
            if (i%2==0)
            {
                i2.add(i);
            }
        }
        System.out.println(i2);
    }
}
