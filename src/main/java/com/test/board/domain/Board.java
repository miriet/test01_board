/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.test.board.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAGCiyP28/Sin8g= >>
// ----------- >>

@Entity
@Table(name = "TEST_BOARD")
@Getter
@Setter
@NoArgsConstructor
// ----------- << class.annotations@AAAAAAGCiyP28/Sin8g= >>
// ----------- >>
public class Board implements Serializable {

    private static final long serialVersionUID = 4272210560210334837L;
    // ----------- << attribute.annotations@AAAAAAGCi7Wyq/UWltM= >>
    // ----------- >>
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_ID")
    private Long id;

    // ----------- << attribute.annotations@AAAAAAGCi7XnT/Ud1Js= >>
    // ----------- >>
    @Column(name = "BOARD_NAME")
    private String boardName;

    // ----------- << attribute.annotations@AAAAAAGCi7YXoPUkfy0= >>
    // ----------- >>
    @Column(name = "BOARD_DESC")
    private String description;

// ----------- << class.extras@AAAAAAGCiyP28/Sin8g= >>
// ----------- >>
}