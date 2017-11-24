package com.root;

import java.util.*;

public class ElectricManager {
    private List<ElectricInterface> list = new ArrayList<ElectricInterface>();

    public void add(ElectricInterface ei) {
        list.add(ei);
    }

    public void stop(ElectricInterface ei) {
        list.remove(ei);
    }

    public void start() {
        if (list.size() != 0) {
            for (ElectricInterface ei : list) {
                if (ei.getState() != true) {
                    ei.star();
                } else {
                    System.out.println(ei.getName() + " is already used ... ");
                }
            }
        } else {
            System.out.println("List is empty .... ");
        }
    }

    public void stop() {
        if (list.size() != 0) {
            for (ElectricInterface ei : list) {
                if (ei.getState() != false) {
                    ei.star();
                } else {
                    System.out.println(ei.getName() + " is stoped now ... ");
                }
            }
        } else {
            System.out.println("List is empty .... ");
        }
    }
}
