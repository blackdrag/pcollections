/*
 * Copyright (c) 2008 Harold Cooper. All rights reserved.
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package org.pcollections;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * <p>Like {@link PSet} but preserves insertion order. Persistent equivalent of
 * {@link LinkedHashSet}.</p>
 *
 * <p>(Note: this is different from {@link PSortedSet}, which keeps elements in the order specified
 * by {@link java.lang.Comparable#compareTo(Object)} or
 * {@link java.util.Comparator#compare(Object, Object)}.)</p>
 *
 * @author Tassilo Horn &lt;horn@uni-koblenz.de&gt;
 * @param <E>
 */
public interface POrderedSet<E> extends PSet<E> {

  public POrderedSet<E> plus(E e);

  public POrderedSet<E> plusAll(Collection<? extends E> list);

  public POrderedSet<E> minus(Object e);

  public POrderedSet<E> minusAll(Collection<?> list);

  E get(int index);

  int indexOf(Object o);
}
