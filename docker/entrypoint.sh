#!/bin/bash
/opt/mssql/bin/sqlservr &
echo "Waiting for SQL Server to start..."
sleep 25
/opt/mssql-tools18/bin/sqlcmd -S localhost -U "sa" -P "$MSSQL_SA_PASSWORD" -Q "IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'pathwaytracker') CREATE DATABASE pathwaytracker;" -C
wait