package com.epam.innerpart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMemberOuter {
    private static final Logger LOG = LogManager.getLogger(TestMemberOuter.class);
    private int data = 30;
    private static final String CODE = "abc";
    private static String name = "NAME";

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public static String getCODE() {
        return CODE;
    }

    public void getInfo(){
        LOG.info(data + " code: " +  CODE);
    }
    class TestInner{
        private final Logger LOG = LogManager.getLogger(TestInner.class);
        private int count = 5;
        /* inner class can not have static declarations

        ERROR
        private static int k = 5;
        */
        public void changeCount(){
            int number = data + count;
            LOG.info(number + " code: " + CODE + " name: "  + name);
        }
    }

    static class TestNested{
        private static final Logger LOG = LogManager.getLogger(TestNested.class);
        private static int k = 10;
        private String str = "nested class";

        public void changeK(){
            /* non-static fields can not be referenced from a static context

            ERROR
            int number = k + data;
            */
            TestMemberOuter testMemberOuter = new TestMemberOuter();
            int number = k + testMemberOuter.getData();
            LOG.info(number + " code: " + CODE + " name: " + name + " info: " + str);
        }

    }

    public static void main(String[] args) {
        TestMemberOuter testMemberOuter = new TestMemberOuter();
        testMemberOuter.getInfo();

        //creating object of inner class
        TestMemberOuter.TestInner testInner = testMemberOuter.new TestInner();
        testInner.changeCount();

        //creating object of nested class
        TestMemberOuter.TestNested testNested = new TestMemberOuter.TestNested();
        testNested.changeK();
    }
}
