package com.atguigu.test;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Administrator
 *去重复数值+数值大于4+升序排列后只返回前3个元素
		List<Integer> list = Arrays.asList(1,2,3,3,3,4,0,-11,5,6,7,8,9);
 */
public class TeacherTest {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(TeacherTest.class);

	public static void main(String[] args) {
		logger.debug("main(String[]) - start");
		List<Integer> list = Arrays.asList(1,2,3,3,3,4,0,-11,5,6,7,8,9);
		listInteger(list);
		logger.debug("main(String[]) - end");
	}
	
	public static void listInteger(List<Integer> list) {
		Collections.sort(list);
		for (int i = 0; i < list.size() / 2; i++) {
			Collections.swap(list, i, (list.size()-1-i));
		}
		Set set = new LinkedHashSet();
		List newList = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			Integer integer = list.get(i);
			if (integer > 4) {
				set.add(integer);
				newList.add(integer);
			}
		}
		Iterator iterator = newList.iterator();
		int i = 1;
		while (iterator.hasNext()) {
			Object next = iterator.next();
			if (i > 3) {
				return;
			}
			i++;
			System.out.println(next);
		}
	}
}
