package com.demo.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
                @Id @GeneratedValue var id: Long = -1,
                @Column(name = "username") var username: String,
                @Column(name = "email") var email: String,
                @Column(name = "picture") var picture: String
) {
        constructor() : this(-1, "", "", "")
}
