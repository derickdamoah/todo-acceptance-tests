#!/bin/bash
sbt -mem 4096 -Daccessibility.audit=true -Daccessibility.htmlvalidator=false -Dbrowser=chrome -Denvironment=local 'testOnly acceptance.suites.RunTodoListSuite'
