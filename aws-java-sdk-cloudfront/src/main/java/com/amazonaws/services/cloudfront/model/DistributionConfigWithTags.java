/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A distribution Configuration and a list of tags to be associated with the distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2016-11-25/DistributionConfigWithTags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributionConfigWithTags implements Serializable, Cloneable {

    /**
     * <p>
     * A distribution configuration.
     * </p>
     */
    private DistributionConfig distributionConfig;
    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     */
    private Tags tags;

    /**
     * <p>
     * A distribution configuration.
     * </p>
     * 
     * @param distributionConfig
     *        A distribution configuration.
     */

    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * A distribution configuration.
     * </p>
     * 
     * @return A distribution configuration.
     */

    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * <p>
     * A distribution configuration.
     * </p>
     * 
     * @param distributionConfig
     *        A distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionConfigWithTags withDistributionConfig(DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @param tags
     *        A complex type that contains zero or more <code>Tag</code> elements.
     */

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @return A complex type that contains zero or more <code>Tag</code> elements.
     */

    public Tags getTags() {
        return this.tags;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @param tags
     *        A complex type that contains zero or more <code>Tag</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionConfigWithTags withTags(Tags tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: ").append(getDistributionConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributionConfigWithTags == false)
            return false;
        DistributionConfigWithTags other = (DistributionConfigWithTags) obj;
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DistributionConfigWithTags clone() {
        try {
            return (DistributionConfigWithTags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
