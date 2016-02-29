package com.swimr.ScalaTestAndroid.scala_android_1.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
  * Scala replacement for MainActivity.java. Change AndroidManifest.xml to make this the default view.
  *
  */
class MainScalaActivity extends Activity {
	protected override def onCreate(savedInstanceState: Bundle) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val myclass: MyScalaClass = new MyScalaClass
		val myScalaString: String = myclass.sayHello
		(findViewById(R.id.myTextview).asInstanceOf[TextView]).setText(myScalaString)

	}
}
