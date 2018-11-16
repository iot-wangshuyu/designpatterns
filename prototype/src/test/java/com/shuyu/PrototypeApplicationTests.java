package com.shuyu;

import com.shuyu.prototype.Resume;
import com.shuyu.prototype2.Resume2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrototypeApplicationTests {

	@Test
	public void clone1() {
		Resume resume=new Resume("测试1");
		resume.setPersonInfo("男","25");
		resume.setWorkExperience("2016-2017","台达");

		Resume resume1=(Resume)resume.clone();
		resume1.setWorkExperience("2017-2018","百度");

		Resume resume2=(Resume)resume.clone();
		resume2.setWorkExperience("2018-2019","阿里");
		resume.show();
		resume1.show();
		resume2.show();

	}


	@Test
	public void clone2() {
		Resume2 resume=new Resume2("测试1");
		resume.setPersonInfo("男","25");
		resume.setWorkExperience("2016-2017","台达");

		Resume2 resume1=(Resume2)resume.clone();
		resume1.setWorkExperience("2017-2018","百度");

		Resume2 resume2=(Resume2)resume.clone();
		resume2.setWorkExperience("2018-2019","阿里");

		resume.show();
		resume1.show();
		resume2.show();
	}

}
