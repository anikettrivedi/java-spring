/*
* prototype pattern is used to create a new object from existing object when some data needs to be copied but creating
* a new object from scratch is too expensive
*
* for example: create a copy of the object returned by db query, it is too expensive to execute query again.
* object can be created with deep or shallow copy, it depends on the requirement.
*
* */
package org.example.creationalpatterns.prototype;