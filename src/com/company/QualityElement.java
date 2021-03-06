package com.company;

/**
 * Created by TessaValentien on 6/26/17.
 */
public class QualityElement {
    /**
     * This class is an umbrella term for anything that could
     * possibly be a node in the graph
     */

    private String factorType;
    private int multiplicity;

    /**
     * Constructor for a QualityElement - keeps generic by taking
     * in a string
     * @param fType what to set the factor type to
     */
    public QualityElement(String fType) {
        this.factorType = fType;
    }

    /**
     * Overloaded constructor
     * @param fType factor type
     * @param mult multiplicity
     */
    public QualityElement(String fType, int mult) {
        this.factorType = fType;
        this.multiplicity = mult;
    }

    /**
     * Getter for factor type
     * @return factor type
     */
    public String getFactorType() {
        return this.factorType;
    }

    /**
     * Setter for factor type
     * @param toSet what to set the factor type to
     */
    public void setFactorType(String toSet) {
        this.factorType = toSet;
    }

    /**
     * Getter for multiplicity
     * @return multiplicity
     */
    public int getMultiplicity() {
        return this.multiplicity;
    }

    /**
     * Setter for multiplicity
     * @param toSet what to set the multiplicity to
     */
    public void setMultiplicity(int toSet) {
        this.multiplicity = toSet;
    }

    /**
     * ToString for QualityElement
     * @return string with factor type
     */
    public String toString() {
        return this.factorType;
    }
}
