# SentinelOps Architecture

## Overview

SentinelOps is an AI-native platform for detecting, diagnosing, and recovering from incidents in distributed systems.

## Demo Distributed Application

The initial application contains three microservices:

- Order Service
- Inventory Service
- Payment Service

A typical request may flow through:

User → Order Service → Inventory Service → Payment Service

Each service will run independently and produce telemetry.

## Observability

The system will collect three primary types of telemetry:

- Metrics
- Logs
- Distributed traces

This telemetry provides evidence about the behavior of the distributed application.

## Incident Analysis

When abnormal behavior is detected, SentinelOps will correlate telemetry from multiple components instead of relying on a single error message.

The analysis pipeline will follow:

Detection → Evidence Collection → Root Cause Analysis → Recovery → Verification

## AI Agent Layer

SentinelOps will use specialized agents for different investigation tasks.

Planned agents include:

- Coordinator Agent
- Metrics Agent
- Log Agent
- Trace Agent
- Root Cause Analysis Agent
- Recovery Agent
- Verification Agent

The agents will collaborate to produce an evidence-backed diagnosis and recovery recommendation.

## Recovery

For selected scenarios, SentinelOps will support controlled recovery actions such as:

- Restarting unhealthy workloads
- Scaling services
- Rolling back problematic deployments

Recovery actions will be followed by verification to determine whether the system returned to a healthy state.