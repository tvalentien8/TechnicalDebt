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

import java.util.List;

import javax.annotation.Nonnull;

import com.google.common.collect.Lists;

/**
 * A source is a reference document that is the basis for the model element it
 * is associated with. For example, the quality attributes from ISO 25010 are
 * associated with the this source description.
 * <br>
 * General Rules:
 * <ul>
 * <li>Always when you take existing text or knowledge from a reference, cite it
 * with the corresponding source.</li>
 * <li>Source can be referenced by various model elements (e.g. Entities,
 * Factors, or Measures).</li>
 * </ul>
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class Source extends QMElement {

    /**
     * An optional title providing a more detailed name of this Source
     */
    private String title;
    /**
     * 
     */
    private String description;
    private String name;

    /**
     * Constructs a new instance of Source
     * 
     * @param name
     *            name of the new Source instance
     */
    public Source(String name)
    {
        super();
        this.name = name;
    }

    /**
     * Constructs a new instance of Source
     * 
     * @param name
     *            name of the new Source instance
     * @param identifier
     *            unique identifier of this Source
     */
    public Source(String name, String identifier)
    {
        super(identifier);
        this.name = name;
    }

    /**
     * @return The title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title
     *            The new title of this Source
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Source> getOriginatesFrom()
    {
        return Lists.newArrayList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addOriginatesFrom(Source source)
    {
        return;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeOriginatesFrom(Source source)
    {
        return;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Creates a new Builder for a Source with the given simple name
     * 
     * @param name
     *            Simple Name
     * @return the Source.Builder instance
     */
    public static Builder builder(String name)
    {
        return new Builder(name);
    }

    /**
     * Creates a new Builder for a Source with the given simple name and unique
     * identifier
     * 
     * @param name
     *            Simple Name
     * @param identifier
     *            Unique identifier
     * @return the Source.Builder instance
     */
    public static Builder builder(String name, String identifier)
    {
        return new Builder(name, identifier);
    }

    /**
     * Builder for Sources implemented using the fluent interface and method
     * chaining patterns.
     * 
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public static class Builder {

        /**
         * Source element under construction
         */
        private Source element;

        /**
         * Constructs a new Builder for a Source with the given name
         * 
         * @param name
         *            The name of the tag to construct
         */
        private Builder(String name)
        {
            element = new Source(name);
        }

        /**
         * Constructs a new Builder for a Source with the given name and unique
         * identifier
         * 
         * @param name
         *            The name of the tag to construct
         * @param identifier
         *            The unique identifier
         */
        private Builder(String name, String identifier)
        {
            element = new Source(name, identifier);
        }

        /**
         * @return The newly constructed Source element
         */
        @Nonnull
        public Source create()
        {
            return (Source) element;
        }

        /**
         * Sets the element under construction's description
         * 
         * @param description
         *            the description to set
         * @return this
         */
        @Nonnull
        public Builder description(String description)
        {
            element.setDescription(description);

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
         * Sets the optional title of the Source under construction
         * 
         * @param title
         *            Title of the Source
         * @return this
         */
        @Nonnull
        public Builder title(String title)
        {
            element.setTitle(title);

            return this;
        }
    }
}
