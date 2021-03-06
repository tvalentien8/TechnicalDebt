/**
 * The MIT License (MIT)
 *
 * SparQLine Quamoco Implementation
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.sparqline.quamoco.model;

import javax.annotation.Nonnull;

/**
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class LinearDecreasingFunction extends LinearFunction {

    /**
     * 
     */
    public LinearDecreasingFunction()
    {
        super();
    }

    public LinearDecreasingFunction(String identifier)
    {
        super(identifier);
    }

    /**
     * Creates a new Builder for a LinearDecreasingFunction
     * 
     * @return the LinearDecreasingFunction.Builder instance
     */
    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Creates a new Builder for a LinearDecreasingFunction with the given
     * identifier
     * 
     * @param identifier
     *            Unique identifier
     * @return the LinearDecreasingFunction.Builder instance
     */
    public static Builder builder(String identifier)
    {
        return new Builder(identifier);
    }

    /**
     * Builder for LinearDecreasingFunctions implemented using the fluent
     * interface and method
     * chaining patterns.
     * 
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public static class Builder {

        /**
         * LinearDecreasingFunction element under construction
         */
        private LinearDecreasingFunction element;

        /**
         * Constructs a new Builder for a LinearDecreasingFunction
         */
        private Builder()
        {
            element = new LinearDecreasingFunction();
        }

        /**
         * Constructs a new Builder for a LinearDecreasingFunction with the
         * given identifier
         * 
         * @param identifier
         *            The identifier of the tool to construct
         */
        private Builder(String identifier)
        {
            element = new LinearDecreasingFunction(identifier);
        }

        /**
         * @return The newly constructed LinearDecreasingFunction element
         */
        @Nonnull
        public LinearDecreasingFunction create()
        {
            return (LinearDecreasingFunction) element;
        }

        /**
         * Sets the element under construction's originatesFrom
         * 
         * @param originatesFrom
         *            the originatesFrom to set
         * @return this
         */
        public Builder originatesFrom(Source originatesFrom)
        {
            element.addOriginatesFrom(originatesFrom);

            return this;
        }

        /**
         * Sets the element under contruction's tagged by
         * 
         * @param taggedBy
         *            the taggedBy to set
         * @return this
         */
        @Nonnull
        public Builder taggedBy(Tag taggedBy)
        {
            element.addTaggedBy(taggedBy);

            return this;
        }

        /**
         * Adds the given annotation to the element under construction.
         * 
         * @param ann
         *            Annotation to add
         * @return this
         */
        @Nonnull
        public Builder annotation(Annotation ann)
        {
            element.addAnnotation(ann);

            return this;
        }

        /**
         * Sets the elements lower bound
         * 
         * @param lb
         *            The lower bound
         * @return this
         */
        @Nonnull
        public Builder lowerBound(double lb)
        {
            element.setLowerBound(lb);

            return this;
        }

        /**
         * Sets the elements upper bound
         * 
         * @param lb
         *            The upper bound
         * @return this
         */
        @Nonnull
        public Builder upperBound(double ub)
        {
            element.setUpperBound(ub);

            return this;
        }
    }
}
