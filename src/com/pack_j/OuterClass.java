package com.pack_j;

public class OuterClass {

    public String getHelpFromOuterClassFromInnerClassFromHelp() {
        return new OuterClass().new InnerClass().getHelpFromInnerClass();
    }

    public class InnerClass {

        private String getHelpFromInnerClass() {
            return new OuterClass().new InnerClass().new Help().getHelp();
        }

        public class Help {
            private String help;

            public Help() {
                this.help = "help";
            }

            private String getHelp() {
                return help;
            }

            private void setHelp(String help) {
                this.help = help;
            }

            public void ayyWorld() {
                System.out.println("what the actual fuck is going on");
            }

        }
    }
}
