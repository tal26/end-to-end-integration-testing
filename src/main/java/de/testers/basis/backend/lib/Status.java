package de.testers.basis.backend.lib;

public class Status {
    public enum Code {
        OK_200(200),
        CREATED_201(201),
        ACCEPTED_202(202);

        private int value;
        Code(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
