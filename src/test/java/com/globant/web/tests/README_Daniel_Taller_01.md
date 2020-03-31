I create three (3) classes. One for each point.

Class Daniel_Taller_01A = To validate LogIn and Logout
Class Daniel_Taller_01B = To validate Creation and Logout
Class Daniel_Taller_01C = To validate LogIn and Delete

At the end, this was the generated XML

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite Taller 1">
  <test thread-count="5" name="Test">
    <classes>
      <class name="com.globant.web.tests.Daniel_Taller_01A"/>
      <class name="com.globant.web.tests.Daniel_Taller_01B"/>
      <class name="com.globant.web.tests.Daniel_Taller_01C"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

