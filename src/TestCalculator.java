import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class TestCalculator {


    Calculator calculator = new Calculator();

    @Test
    public void should_return_two_when_one_plus_one(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        assertThat(calculator.add(arrayList), is(2));
    }

    @Test
    public void should_return_three_when_one_plus_two(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        assertThat(calculator.add(arrayList), is(3));
    }
    @Test
    public void should_return_sum_of_number(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        assertThat(calculator.add(arrayList), is(10));
    }
    @Test
    public void should_return_one_when_one_multiply_one(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        assertThat(calculator.multiply(arrayList), is(1));
    }

    @Test
    public void should_return_two_when_one_multiply_two(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        assertThat(calculator.multiply(arrayList), is(2));
    }

    @Test
    public void should_return_the_number_multiplied_by_a_random_number(){
        System.out.print(calculator.nextInt*2);
        assertThat(calculator.multiplyByRandom(2), is(calculator.nextInt * 2));
        System.out.print(calculator.nextInt);
    }


}
