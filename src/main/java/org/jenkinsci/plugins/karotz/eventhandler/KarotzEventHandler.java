/*
 * The MIT License
 *
 * Copyright (c) 2011, Seiji Sogabe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.karotz.eventhandler;

import hudson.ExtensionPoint;
import hudson.model.AbstractBuild;
import hudson.model.AbstractDescribableImpl;
import hudson.model.BuildListener;
import hudson.model.Descriptor;
import org.jenkinsci.plugins.karotz.KarotzException;

/**
 * karotz Event Handler.
 *
 * @author Seiji Sogabe
 */
public abstract class KarotzEventHandler extends AbstractDescribableImpl<KarotzEventHandler>
        implements ExtensionPoint {

    /**
     * Triggered on build start.
     *
     * @param build The build in progress
     * @param listener build listener
     */
    public abstract void onStart(AbstractBuild<?, ?> build, BuildListener listener) throws KarotzException;

    /**
     * Triggered on build failure.
     *
     * @param build The build in progress
     * @param listener build listener
     */
    public abstract void onFailure(AbstractBuild<?, ?> build, BuildListener listener) throws KarotzException;

    /**
     * Triggered on build recover.
     *
     * @param build The build in progress
     * @param listener build listener
     */
    public abstract void onRecover(AbstractBuild<?, ?> build, BuildListener listener) throws KarotzException;

    /**
     * Triggered on build success.
     *
     * @param build The build in progress
     * @param listener build listener
     */
    public abstract void onSuccess(AbstractBuild<?, ?> build, BuildListener listener) throws KarotzException;

    /**
     * Triggered on build unstable.
     *
     * @param build The build in progress
     * @param listener build listener
     */
    public abstract void onUnstable(AbstractBuild<?, ?> build, BuildListener listener) throws KarotzException;

    @Override
    public Descriptor<KarotzEventHandler> getDescriptor() {
        return (KarotzEventHandlerDescriptor) super.getDescriptor();
    }
}
