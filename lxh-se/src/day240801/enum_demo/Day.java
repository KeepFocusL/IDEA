package day240801.enum_demo;

public enum Day implements FofEnumDemo {
    MONDAY {
        @Override
        public void desc() {
            System.out.println("XXX");
        }
    },
    TUESDAY {
        @Override
        public void desc() {

        }
    },
    MEDNESDAY {
        @Override
        public void desc() {

        }
    },
    THURDAY {
        @Override
        public void desc() {

        }
    },
    FIRDAY {
        @Override
        public void desc() {

        }
    },
    SATURDAY {
        @Override
        public void desc() {

        }
    },
    SUNDAY {
        @Override
        public void desc() {

        }
    }
}
