/* Copyright (c) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.data.gtt;

import com.google.gdata.data.BaseEntry;
import com.google.gdata.data.Link;
import com.google.gdata.data.acl.AclNamespace;
import com.google.gdata.data.media.MediaEntry;

/**
 * Describes a glossary entry.
 *
 * 
 */
public class GlossaryEntry extends MediaEntry<GlossaryEntry> {

  /**
   * Default mutable constructor.
   */
  public GlossaryEntry() {
    super();
  }

  /**
   * Constructs a new instance by doing a shallow copy of data from an existing
   * {@link BaseEntry} instance.
   *
   * @param sourceEntry source entry
   */
  public GlossaryEntry(BaseEntry<?> sourceEntry) {
    super(sourceEntry);
  }

  /**
   * Returns the link that provides the URI of the feed for the access control
   * list for the entry.
   *
   * @return Link that provides the URI of the feed for the access control list
   *     for the entry or {@code null} for none.
   */
  public Link getAccessControlListLink() {
    return getLink(AclNamespace.LINK_REL_ACCESS_CONTROL_LIST, Link.Type.ATOM);
  }

  @Override
  public String toString() {
    return "{GlossaryEntry " + super.toString() + "}";
  }

}

