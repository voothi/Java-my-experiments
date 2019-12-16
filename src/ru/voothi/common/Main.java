package ru.voothi.common;

public class Main {
    not present

    public static void main(String[] args) {
        //save AbstractArrayStorage
        String uuid = resume.getUuid();
        int index = getIndex(uuid);
        if (size >= LENGTH) {
            System.out.println("There is no space in the storage for the new entry.");
        } else {
            insertByIndex(resume, index);
        }

        //insertByIndex ArrayStorage

        //insertByIndex SortedArrayStorage


        present
        int insert = -index - 1;
        if (index >= 0) {
            System.out.println("Resume " + resume.getUuid() + " present");
        } else if (index == -1 || insert == size) {
            storage[size] = resume;
            size++;
        } else {
            int length = size - insert;
            System.arraycopy(storage, insert, storage, insert + 1, length);
            storage[insert] = resume;
            size++;
        }

        int insert = -index - 1;
        if (index >= 0) {
            System.out.println("Resume " + resume.getUuid() + " present");
        } else if (index == -1) {
            method(resume, size);
        } else {
            if (insert == size) {
                method(resume, insert);
            } else {
                int length = size - insert;
                System.arraycopy(storage, insert, storage, insert + 1, length);
                method(resume, insert);
            }
        }

        void method(Resume resume, int index) {
            storage[index] = resume;
            size++;
        }



        // Эквивалентно?
        int insert = -index - 1;
        if (index >= 0) {
            System.out.println("Resume " + resume.getUuid() + " present");
        } else {
            if (index == -1) {
                storage[size] = resume;
                size++;
            }
            if (insert == size) {
                storage[size] = resume;
                size++;
            } else {
                int length = size - insert;
                System.arraycopy(storage, insert, storage, insert + 1, length);
                storage[insert] = resume;
                size++;
            }
        }

        if (case1) {
            console.log("outcome1")
        } else {
            if (case2) {
                console.log("outcome2")
            } else {
                console.log("outcome3")
            }
        }

        if (case1) {
            console.log("outcome1")
        } else {
            if (case2) {
                console.log("outcome2")
            } else {
                if (case2) {
                    console.log("outcome2")
                } else {
                    console.log("outcome3")
                }
                console.log("outcome3")
            }
        }


        if (case1) {
            outcome1
        } else {
            if (case2) {
                outcome2
            } else {
                if (case3) {
                    outcome3
                } else {
                    outcome4
                }
            }
        }

        if (case1) {
            outcome1
        } else if (case2) {
            outcome2
        } else {
            if (case3) {
                outcome3
            } else {
                outcome4
            }
        }


        //AND
        AND;
        if (case0) {
            out0
        } else if (case11 || case12) {
            true
        } else {
            false
        }

        AND;
        if (case0) {
            out0
        } else if (case11) {
            if (case12) {
                true
            }
        } else {
            false
        }

        //OR
        OR;
        if (case0) {
            out0
        } else if (case11 || case12) {
            true
        } else {
            false
        }

        if (case1) {
            out1
        } else {
            if (case2) {
                out2
            } else {
                if (case3) {
                    out3
                } else {
                    out4
                }
            }
        }

    }


}
