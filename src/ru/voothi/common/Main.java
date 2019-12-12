package ru.voothi.common;

public class Main {
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
        if (index == -1) {
            storage[size] = resume;
            size++;
        } else {
            System.out.println("Resume " + resume.getUuid() + " present");
        }

        //insertByIndex SortedArrayStorage
        if (index >= 0) {
            System.out.println("Resume " + resume.getUuid() + " present");
        } else {
            int insert = -index - 1;
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

        present
        index !== -1 || index >= 0
            System.out.println("Resume " + resume.getUuid() + " present");


        not present
