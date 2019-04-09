package com.example.demo.mock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.example.demo.bean.User;

public class Mock {
	public static final String User_Key = "user";

	public static final List<User> userList = new ArrayList() {
		{
			add(new HashMap() {
				{
					put("user", "user");
				}
			});
			add(new HashMap() {
				{
					put("admin", "admin");
				}

			});
		}

	};
}
