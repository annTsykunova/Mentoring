package com.epam.innerpart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
    Creating outer enum, inner class A, nested class C
    class C includes enum (static by default)
    outer enum Season includes inner enum Day
 */
public enum Season {

    WINTER, SUMMER;

    private final Logger LOG = LogManager.getLogger(Season.class);

    Season() {
        LOG.info("Season");
        class B {
            private final Logger LOG = LogManager.getLogger(B.class);

            public void ff() {
                LOG.info("B");
            }
        }
        new B().ff();
    }

    class A {
        private final Logger LOG = LogManager.getLogger(A.class);

        public void f() {
            LOG.info("Hello");
        }
    }

    static class C {
        private static final Logger LOG = LogManager.getLogger(C.class);

        public void cf() {
            LOG.info("C");
        }

        enum InnerEnum {
            ITEM1, ITEM2;
            private final Logger LOG = LogManager.getLogger(InnerEnum.class);

            InnerEnum() {
                LOG.info("InnerEnum");
            }
        }
    }

    public static void main(String[] args) {
        Season s = Season.SUMMER;
        Season.A a = s.new A();
        a.f();
        Season.Day d = Day.MONDAY;
        Season.C c = new Season.C();
        c.cf();
        C.InnerEnum innerEnum = C.InnerEnum.ITEM1;
    }

    enum Day {
        MONDAY, SUNDAY, SATURDAY;

        private final Logger LOG = LogManager.getLogger(Day.class);

        Day() {
            LOG.info("Day");
        }
    }
}

