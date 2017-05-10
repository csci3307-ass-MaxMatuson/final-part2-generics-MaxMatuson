/**
 * 
 */
package com.mycompany.final_part2.generics;

/**
 * @author Maxi
 *
 */
public class MyGenClass <K,V> implements MyGenInterface <K,V> 
{
	private K key;
	private V value;
	
	public MyGenClass(K K_key,V V_value) 
	{
		key=K_key;
		value=V_value;

	}
	
	@Override
	public K getKey() 
	{
		return key;
	}

	@Override
	public V getValue() 
	{
		return value;
	}

}
